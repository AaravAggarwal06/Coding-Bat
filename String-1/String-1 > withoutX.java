public String withoutX(String str) {
if (str.length()==0)
return str;

if (str.length()==1 && str.charAt(0)=='x')
return "";

if(str.length()==2 && str.charAt(0)=='x' && str.charAt(1)=='x'){
return "";
}

if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x'){
return str.substring(1,str.length()-1);
}

if(str.charAt(0)=='x')
return str.substring(1,str.length());

if(str.charAt(str.length()-1)=='x')
return str.substring(0,str.length()-1);

return str;
}