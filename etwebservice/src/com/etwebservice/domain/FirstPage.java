package com.etwebservice.domain;

public class FirstPage {
private int fimageId;
private String fImage;

public FirstPage(){
	
}

public FirstPage(int fimageId,String fImage){
	this.fimageId=fimageId;
	this.fImage=fImage;
}

public int getFimageId() {
	return fimageId;
}

public void setFimageId(int fimageId) {
	this.fimageId = fimageId;
}

public String getfImage() {
	return fImage;
}

public void setfImage(String fImage) {
	this.fImage = fImage;
}

@Override
public String toString() {
	return "FirstPage [fimageId=" + fimageId + ", fImage=" + fImage + "]";
}

}
