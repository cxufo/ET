
function getStyle(obj, name)
{
	if(obj.currentStyle)
	{
		return obj.currentStyle[name];
	}
	else
	{
		return getComputedStyle(obj, false)[name];
	}
}

function startMove(obj, json, fnEnd)
{
	//���������ʱ��������ʱ������ʱ�����Ƴ�ʱ��ʱ���ִ򿪣�����ͬʱ������������ã����ֳ�ͻ������bug
	clearInterval(obj.timer);   //firstsetp: �����ǰ�˶�����Ķ�ʱ����
	obj.timer = setInterval(function() {   //secondstep: ������ʱ��
		var bStop = true; //���裺���ж�����Ŀ�꣬����ֹͣ��

		for(var attr in json)
		{
			var cur = 0;   //��cur���洢����

			if(attr == 'opacity')
			{
				cur = Math.round(parseFloat(getStyle(obj, attr)) * 100);  //opacity��С���������豸ֻ��ȥ����ֵ��������round��������ȡ������
			}
			else
			{
				cur = parseInt(getStyle(obj, attr));   //����û��С����
			}

			var speed = (json[attr] - cur) / 15;   //thirdstep: �����ٶȣ����ٶ����������ȣ�����iTargetԽ���ٶ�Խ��
			speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed);  //�����˶�����ȡ������Ϊ����Խ�����ٶȿ���Ϊ������㼸��С����

			if(cur != json[attr]) //����û�е���Ŀ���
			{
				bStop = false;  //���Ի�����ֹͣ
			}

			if(attr == 'opacity')
			{
				obj.style.filter = 'alpha(opacity:' + (cur + speed) + ')';
				obj.style.opacity = (cur + speed) / 100;
			}
			else
			{
				obj.style[attr] = cur + speed + 'px';
			}


			if(bStop)
			{
				clearInterval(obj.timer);
				if(fnEnd) fnEnd();
			}
		}
	},30);
}

//�����˶�
function uniformMotion(obj, json, fnEnd)
{
	clearInterval(obj.timer);
	obj.timer = setInterval(function() {
		var bStop = true; //���裺���ж�����Ŀ�꣬����ֹͣ��

		for(var attr in json)
		{
			var cur = 0;   

			if(attr == 'opacity')
			{
				cur = Math.round(parseFloat(getStyle(obj, attr)) * 100);  //opacity��С���������豸ֻ��ȥ����ֵ��������round��������ȡ������
			}
			else
			{
				cur = parseInt(getStyle(obj, attr));   //����û��С����
			}

			var speed = 0;   //thirdstep: �����ٶ�
			if(cur < json[attr])
			{
				speed = 6;
			}
			else
			{
				speed = -6;
			}

			if(cur != json[attr]) //����û�е���Ŀ���
			{
				bStop = false;  //���Ի�����ֹͣ
			}


			if(Math.abs(json[attr] - cur) <= 6)
			{
				if(attr == 'opacity')
				{
					obj.style.filter = 'alpha(opacity:' + json[attr] + ')';
					obj.style.opacity = json[attr] / 100;
				}
				else
				{
					obj.style[attr] = json[attr] + 'px';
				}
			}
			else
			{
				if(attr == 'opacity')
				{
					obj.style.filter = 'alpha(opacity:' + (cur + speed) + ')';
					obj.style.opacity = (cur + speed) / 100;
				}
				else
				{
					obj.style[attr] = cur + speed + 'px';
				}
			}



			if(bStop)
			{
				clearInterval(obj.timer);
				if(fnEnd) fnEnd();
			}
		}
	}, 30);
}