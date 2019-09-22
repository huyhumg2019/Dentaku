package dentaku;

 class Num {
private long num;
public void setNum(long num){
	this.num=num;

}
public long assemble(String letter){
	num =num*10+Long.parseLong(letter);
	return num;
}
}