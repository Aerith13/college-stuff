#include <stdio.h>
#include <string.h>
int main()
{
  char a[100];
  char b[100];
  int length,i, j;

  printf("Enter 1st string: \n");
  gets(a);
  length = strlen(a);
  printf("Length of first string = %d\n", length);
  printf("\n");
  printf("Enter 2nd string: \n");
  gets(b);
  length = strlen(b);
  printf("Length of 2nd string = %d\n", length);
  printf("\n");
  {
  for(i=0;a[i]!='\0';i++);       
    for(int j=0;b[j]!='\0';j++)  
    {  
        
        a[i]=b[j];  
        i++;  
    }  
    a[i]='\0';  
   printf("concatenating...");
   printf("\n");
   printf("\n");
   printf("concatenated version: %s", a); 
}
	printf("\n");
	length=strcmp(a,b);
	printf("Are the strings of same length?");
	printf("\n");
	
	{
     if(length==0)  
     printf("strings are same");  
     else  
     printf("strings are not same");  

	}
  return 0;
}
