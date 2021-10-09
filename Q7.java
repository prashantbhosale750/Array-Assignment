class Q7 {
	public static void main (String args[]){
	int a1[]={1,2,3,4,5,6,7,8,9,10};
	int a2[]={9,10,11,12,13,14,15,16,17,18};
	int a3[]={8,9,10,21,22,23,24,25,26,27};
	for (int i=0;i<a1.length;i++){
		for (int j=0;j<a2.length;j++)
		for (int k=0;k<a3.length;k++)	
			if (a1[i]==a2[j]){
				if(a2[j]==a3[k])
			System.out.println(a1[i]);}
}
}
}