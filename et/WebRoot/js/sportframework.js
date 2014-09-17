
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
	//若不清除定时器，移入时开启定时器，移出时定时器又打开，函数同时被几个物体调用，出现冲突，产生bug
	clearInterval(obj.timer);   //firstsetp: 清除当前运动物体的定时器；
	obj.timer = setInterval(function() {   //secondstep: 开启定时器
		var bStop = true; //假设：所有都到达目标，可以停止了

		for(var attr in json)
		{
			var cur = 0;   //用cur来存储物体

			if(attr == 'opacity')
			{
				cur = Math.round(parseFloat(getStyle(obj, attr)) * 100);  //opacity是小数，计算设备只能去近似值，所以用round四舍五入取整数。
			}
			else
			{
				cur = parseInt(getStyle(obj, attr));   //像素没有小数。
			}

			var speed = (json[attr] - cur) / 15;   //thirdstep: 计算速度，此速度与距离成正比，即离iTarget越近速度越慢
			speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed);  //缓冲运动必须取整，因为距离越近，速度可能为正负零点几的小数。

			if(cur != json[attr]) //还有没有到达目标的
			{
				bStop = false;  //所以还不能停止
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

//匀速运动
function uniformMotion(obj, json, fnEnd)
{
	clearInterval(obj.timer);
	obj.timer = setInterval(function() {
		var bStop = true; //假设：所有都到达目标，可以停止了

		for(var attr in json)
		{
			var cur = 0;   

			if(attr == 'opacity')
			{
				cur = Math.round(parseFloat(getStyle(obj, attr)) * 100);  //opacity是小数，计算设备只能去近似值，所以用round四舍五入取整数。
			}
			else
			{
				cur = parseInt(getStyle(obj, attr));   //像素没有小数。
			}

			var speed = 0;   //thirdstep: 计算速度
			if(cur < json[attr])
			{
				speed = 6;
			}
			else
			{
				speed = -6;
			}

			if(cur != json[attr]) //还有没有到达目标的
			{
				bStop = false;  //所以还不能停止
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