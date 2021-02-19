////////////////////////    1     ///////////////////////
/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
*/
//////////////////////////////////////////////////////////
public String stringTimes(String str, int n) {
  int i=0;
  String s="";
  while(i<n){
    s+=str;
    
  i++;
}
return s;
}

////////////////////////    2     ///////////////////////
/*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/
//////////////////////////////////////////////////////////
public String frontTimes(String str, int n) {
  if(str.length()>3){
    str=str.substring(0,3);
  }
  String s="";
  for(int i=0; i<n;i++){
    s+=str;
  }
  return s;
}

////////////////////////    3     ///////////////////////
/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
*/
//////////////////////////////////////////////////////////
int countXX(String str) {
  int l=0;
  for(int i=0;i<str.length()-1;i++){
    if(str.substring(i,i+2).equals("xx"))
    l++;
  }
  return l;
}
////////////////////////    4     ///////////////////////
/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/
//////////////////////////////////////////////////////////
boolean doubleX(String str) {
  for(int i=0;i<str.length()-1;i++){
    if(str.charAt(i)=='x'){
    return str.charAt(i+1)=='x';
  
    }
    }
    return false;
}

////////////////////////    5     ///////////////////////
/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/
//////////////////////////////////////////////////////////
public String stringBits(String str) {
  String s="";
  for(int i=0;i<str.length();i=i+2){
    s+=str.charAt(i);
    
  }
  return s;
}

////////////////////////    6     ///////////////////////
/*
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/
//////////////////////////////////////////////////////////
public String stringSplosion(String str) {
  String s="";
  String l="";
  for(int i=0;i<str.length();i++){
    l=str.substring(0,i+1)  ;
    s+=l;
    
  }
  return s;

}

