import java.util.Arrays;
 
// Program to validate IPv4 address in Java 8 and above
class ValidateIPAddress
{
    public static void isValidInet4Address(String ip)
    {
        String[] groups = ip.split("\\.");
 
        //if (groups.length != 4)
         //   return false;
	for(int i = 0; i<4; i++)
	{
	   System.out.println(Integer.valueOf(groups[i]));
	}
     }
     public static void main(String[] args)
	{
	   isValidInet4Address("123.456.123.19");
	}
}