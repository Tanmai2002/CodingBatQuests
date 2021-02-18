///////////////     1     ///////////////////////
/*The parameter weekday is true if it is a weekday, 
and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true*/

///////////////////////////////////////////////////////
public boolean sleepIn(boolean weekday, boolean vacation) {
  if(!weekday|| vacation)
  return true;
  return false;
}
///////////////     2     ///////////////////////
/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false*/

///////////////////////////////////////////////////////
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if((aSmile && bSmile)||(!aSmile && !bSmile))
  return true;
  return false;
}
///////////////     3     ///////////////////////
/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/

///////////////////////////////////////////////////////
public int sumDouble(int a, int b) {
  int val=a+b;
  if(a==b)
  val*=2;
  
  return val;
}
///////////////     4     ///////////////////////
/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
*/

///////////////////////////////////////////////////////
public int diff21(int n) {
  int i=21-n;
  if (i<0)
  i=i*(-2);
  return i;
}

///////////////     5     ///////////////////////
/*

We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
*/

///////////////////////////////////////////////////////
public boolean parrotTrouble(boolean talking, int hour) {
  return (talking && (hour>20 || hour<7 ));
  
}

///////////////     6     ///////////////////////
/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/

///////////////////////////////////////////////////////
public boolean makes10(int a, int b) {
  return (a==10 || b==10 ||(a+b)==10);
}


///////////////     7     ///////////////////////
/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
*/

///////////////////////////////////////////////////////
public boolean nearHundred(int n) {
  return(Math.abs(n-100)<=10 || Math.abs(n-200)<=10);
}

///////////////     8     ///////////////////////
/*

Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
*/

///////////////////////////////////////////////////////
public boolean posNeg(int a, int b, boolean negative) {
  if(!negative){
   return(a*b<0);
}else{
  return(a<0&&b<0);
}
}

///////////////     9     ///////////////////////
/*


Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*/

///////////////////////////////////////////////////////
public String notString(String str) {
  return str.startsWith("not")?str:("not "+str);
}


///////////////     10     ///////////////////////
/*

Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
*/

///////////////////////////////////////////////////////
public String missingChar(String str, int n) {
    String s="";
    for(int i=0;i<str.length();i++){
      if(i==n)
      continue;
      s+=str.charAt(i);
    }
    return s;
}

///////////////     11     ///////////////////////
/*

Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/

///////////////////////////////////////////////////////
public String frontBack(String str) {
  int l=str.length();
  return l>1?(str.charAt(l-1)+str.substring(1,l-1)+str.charAt(0)):str;

    
  }
  
  ///////////////     12     ///////////////////////
/*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there. 
Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
*/

///////////////////////////////////////////////////////
public String front3(String str) {
  int l=str.length();
  if(l>2)
    str=str.substring(0,3);
    return str+str+str;
  
}









