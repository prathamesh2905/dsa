class Demo{
	public static void main(String []args){
		int n = 18;
		int orignal = n;
		int sum = 0;
		fun(n,sum);
	}
		static String fun(int n){
			int digit = n%10;
			sum +=digit;
			n=n/10;

			if(original%sum==0){
				return "Harshad number";
			}else{
				fun(n,sum);
			}
		}
}