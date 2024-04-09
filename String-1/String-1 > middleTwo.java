public String middleTwo(String str) {
  int HalfLength = str.length()/2-1;
  int Half = (str.length()/2)+1;
  String sub = str.substring(HalfLength,Half);
  
  if(str.length()==2){
    return str;
  }
  else{
  return sub;   
  }

}