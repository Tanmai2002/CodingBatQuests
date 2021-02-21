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

////////////////////////    7     ///////////////////////
/*

Given a string, return the count of the number of times that a substring length 2
appears in the string and also as the last 2 chars of the string,
so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
*/
//////////////////////////////////////////////////////////
public int last2(String str) {
  if(str.length()<3) return 0;
  String s=str.substring(str.length()-2);
  int l=0;
  for (int i=0;i<str.length()-1;i++){
    if(str.substring(i,i+2).equals(s))
    l++;
  }
  return l-1;
}


////////////////////////    8     ///////////////////////
/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
*/
//////////////////////////////////////////////////////////
public int arrayCount9(int[] nums) {
  int k=0;
  for(int i:nums){
    if (i==9) k++;
  }
  return k;
}


////////////////////////    9     ///////////////////////
/*

Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
*/
//////////////////////////////////////////////////////////
public boolean arrayFront9(int[] nums) {
  for(int i=0;i<nums.length;i++){
    if (nums[i]==9) return true;
    if(i==3 ) break;
  }
  return false;
}

////////////////////////    10     ///////////////////////
/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/
//////////////////////////////////////////////////////////
public boolean array123(int[] nums) {
  for(int i=0;i<nums.length-2;i++){
    if(nums[i]==1&&nums[i+1]==2&&nums[i+2]==3) return true;
  }
  return false;
}

////////////////////////    11     ///////////////////////
/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
*/
//////////////////////////////////////////////////////////
public int stringMatch(String a, String b) {
  int k=0;
  int l=(a.length()>b.length())?b.length():a.length();
  for(int i=0;i<(l-1);i++){
    if(a.substring(i,i+2).equals(b.substring(i,i+2))) k++;
  }
  return k;
}


////////////////////////    12     ///////////////////////
/*

Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/
//////////////////////////////////////////////////////////
public String stringX(String str) {
  String l="";
  for(int i=0;i<str.length();i++){
    if(i!=0&&i!=str.length()-1&&str.charAt(i) =='x'){ 
     continue;
    }
     l+=str.charAt(i);
  }
  return l;
}


////////////////////////    13     ///////////////////////
/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/
//////////////////////////////////////////////////////////
public String altPairs(String str) {
  String s="";
  for (int i=0;i<str.length();i=i+4){
    s+=str.charAt(i);
    if(i+1==str.length()) break;
    s+=str.charAt(i+1);
  }
  return s;
}

////////////////////////    14     ///////////////////////
/*

Given an array of ints, return true if it contains a 2, 7, 1 pattern:
a value, followed by the value plus 5, followed by the value minus 1.
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
*/
//////////////////////////////////////////////////////////
public boolean has271(int[] nums) {
  for (int i=0;i<nums.length-2;i++){
    int t=nums[i];
    if(nums[i+1]==t+5&&Math.abs(t-nums[i+2]-1)<=2) return true;
  }
  return false;
}




