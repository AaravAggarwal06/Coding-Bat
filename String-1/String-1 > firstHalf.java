public String firstHalf(String str) {
  int HalfLength = str.length()/2;
  String sub = str.substring(0,HalfLength);
  return sub;
}