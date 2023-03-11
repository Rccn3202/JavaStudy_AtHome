package chap18_DataInputOutput.sec07;

public class ReadLineEx {

	public static void main(String[] args) throws Exception{
		Buffereader br = new Buffereader(
				new FileReader("")
				);
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo+"\t"+str);
			lineNo++;
		}
		br.close();

	}

}
