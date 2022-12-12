package Graph;
public class Hack{

static void Main(String[] args) {

String string1= "Hello";

String string2= "WORLDS";

string2 =String.Concat(string1,string2);
String string3=string2.TrimStart('H');

Console.WriteLine(string3);
}
}