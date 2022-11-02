import java.util.*;
class excopy{
	
	static String[] StID={"1","2"};
	static String[] StName={"1","2"};
	static int[] MrPRF={70,-1};
	static int[] MrDBMS={80,-1};
	static int[] TotalMarks={};
	static double[] AvgMarks={};
	
	
	
	public static void main(String args[]){
		SortArray();
		//System.out.println(Arrays.toString(StID));
		//System.out.println(Arrays.toString(StName));
		System.out.println("MrPRF"+Arrays.toString(MrPRF));
		System.out.println("MrDBMS"+Arrays.toString(MrDBMS));
		//System.out.println(Arrays.toString(TotalMarks));
		//System.out.println(Arrays.toString(AvgMarks));
		
	}



	public static void SortArray(){
		int[] TempTotalMarks=new int[MrPRF.length];
		double[] TempAvgMarks=new double[MrPRF.length] ; 
		for(int i=0; i<MrPRF.length; i++){
			TempTotalMarks[i]=MrPRF[i]+MrDBMS[i];
			TempAvgMarks[i]=(double)TempTotalMarks[i]/2;
		}
		TotalMarks=TempTotalMarks;
		AvgMarks=TempAvgMarks;
		
		for (int j = StID.length-1; j >= 0; j--){
			for (int i = 0; i < j; i++){
				if (TotalMarks[i]>TotalMarks[i+1]){
					int temp=TotalMarks[i];
					String StIDtemp=StID[i];
					String StNametemp=StName[i];
					int MrPRFtemp=MrPRF[i];
					int MrDBMStemp=MrDBMS[i];
					double AvgMarkstemp=AvgMarks[i];
						
					TotalMarks[i]=TotalMarks[i+1];
					StID[i]=StID[i+1];
					StName[i]=StName[i+1];
					MrPRF[i]=MrPRF[i+1];
					MrDBMS[i]=MrDBMS[i+1];
					AvgMarks[i]=AvgMarks[i+1];
						
						
					TotalMarks[i+1]=temp;
					StID[i+1]=StIDtemp;
					StName[i+1]=StNametemp;
					MrPRF[i+1]=MrPRFtemp;
					MrDBMS[i+1]=MrDBMStemp;
					AvgMarks[i+1]=AvgMarkstemp;
				}
				
			}
		}
		
	}
	
	
	
}
