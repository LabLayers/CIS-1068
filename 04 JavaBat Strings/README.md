## http://codingbat.com/prob/p172063

````java
public String extraFront(String str) {
  String newStr="";
  if (str.length() >= 2) newStr=str.substring(0,2);
  else if (str.length() == 1) newStr=str.substring(0,1);
  newStr=newStr+newStr+newStr;
  return newStr;
}
````

## http://codingbat.com/prob/p132118

````java
public String conCat(String a, String b) {
  if (a.length() == 0 || b.length() == 0) {
    return a + b;
  }
  else if (a.charAt(a.length()-1) == b.charAt(0)) {
    return a.substring(0,a.length()-1) + b;
  } else {
    return a + b;
  }
}
````

## http://codingbat.com/prob/p152339

````java
public String repeatEnd(String str, int n) {
  String r="";
  for (int i=n;i>0;i--) r=r+str.substring(str.length()-n,str.length());
  return r;
}
````

## http://codingbat.com/prob/p197890

````java
public int sumDigits(String str) {
  int sum=0;
  for (int i=0;i<str.length();i++) {
    if (Character.isDigit(str.charAt(i))) sum+=Integer.parseInt(Character.toString(str.charAt(i)));
  }
  return sum;
}
````

## http://codingbat.com/prob/p195714
````java
public int countTriple(String str) {
  if(str.length() < 3) return 0;
  int triples = 0;
  for(int i=0;i<str.length()-2;i++) {
    if((str.charAt(i) == str.charAt(i+1)) && (str.charAt(i) == str.charAt(i+2))) triples += 1;
  }
  return triples;
}
````