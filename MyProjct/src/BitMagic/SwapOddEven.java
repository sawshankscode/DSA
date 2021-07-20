package BitMagic;

public class SwapOddEven {
	public static int swap(int n) {
		 return ((n& 0xAAAAAAA)>>1 | ((n& 0x55555555)<<1));
	}
	public static void main(String[] args) {
		System.out.println(swap(23));
	}
}
