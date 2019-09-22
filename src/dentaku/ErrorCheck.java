package dentaku;

class ErrorCheck{
		final long MAX_LENGTH=String.valueOf(Double.MAX_VALUE).length()-5;
		final double MAX_VALUE=Double.MAX_VALUE/10;
		final double MIN_VALUE=Double.MIN_VALUE*10;

		public boolean run(double value) {
			String msgText="";
			boolean returnCode=false;
			if (value<MIN_VALUE||value>MAX_VALUE) {
				returnCode=true;
				msgText="*ERROR: 桁数オーバー*";
				System.out.println(msgText);
				System.out.println(value);
			}
			return returnCode;
		}
	}