public class Main
{
  public static void main(String[] args)
  {
    lastFirstN("cream", "butter", 4);
    stringManip("apple", "banana");
    removeStr("bdaboom", "ada");
  }

  public static void lastFirstN(String s1, String s2, int n)
  {
    String firstN;
    String lastN;
    String output;
    
    int s1Len = s1.length();
    int s2Len = s2.length();

    firstN = s1.substring(s1Len-n,s1Len);
    lastN = s2.substring(0,n);

    output = firstN + lastN;
    System.out.println(output);
  }

  public static void stringManip(String s1, String s2)
  {
    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();
    String s3;
    s3 = s2.substring(1,s2.length());
    s3 = s3.toLowerCase();
    s2 = s2.substring(0,1);
    s2 = s2 + s3;
    System.out.println(s1 + " " + s2);
  }

  public static void removeStr(String s1, String s2)
  {
    String output = null;
    int indexS = s1.indexOf(s2);
    int indexE = indexS + s2.length();
    output = s1.substring(0,indexS) + s1.substring(indexE,s1.length());
    System.out.println(output);
  }
}
