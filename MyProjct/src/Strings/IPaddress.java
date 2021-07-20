package Strings;

public class IPaddress {
	public static boolean checkValidIp(String ip, int dotCount, String range){
        return (ip.charAt(ip.length()-1)!='.' && dotCount==3 && Integer.parseInt(range)<=255)? true : false;
    }
    
    public static boolean checkValidRange(String range, char data){
        return ( range.equals("0")==false && Integer.parseInt(range+data)<=255 )? true : false;
    }
    
    public static void genIpUtil(String s, int index, int dotCount, String range, String ip, ArrayList<String> ipList){
        
        if(index > s.length()){
            return;
        }
        
        if(index == s.length()){
            if(checkValidIp(ip, dotCount, range)){
                ipList.add(ip);
            }
            return;
        }
        
        if(dotCount<3 && checkValidRange(range, s.charAt(index)))
            genIpUtil(s, index+1, dotCount+1, "", ip+s.charAt(index)+".", ipList);
        
        if( checkValidRange(range, s.charAt(index)) ){
            genIpUtil(s, index+1, dotCount, range+s.charAt(index), ip+s.charAt(index), ipList);
        }
    }
    
    public ArrayList<String> genIp(String s) {
        
        ArrayList<String> ipList = new ArrayList<String>();
        
        genIpUtil(s, 0, 0, "", "", ipList);
        return ipList;
    }
}
