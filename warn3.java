public class warn3 {
  public static void main(String args[]) {

int i[]={2,6,10,5,33,9,87};
int max=0;
int min=999;
int total=0;
for(int j=0;j<i.length;j++){
 if(max<i[j]) max=i[j];
 if(min>i[j]) min=i[j];
total+=i[j];
}
    System.out.println("max="+max);
    System.out.println("min="+min);
    System.out.println("total="+total);
}
}