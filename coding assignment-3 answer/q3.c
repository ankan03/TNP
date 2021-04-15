#include <stdio.h>
#include <stdlib.h>
void ascSort(int* a , int n){

	for (int i = 0; i < n; ++i)
	{
		for (int j = i+1; j < n; ++j)
		{
			if (*(a+i)>*(a+j))
			{
				int t=*(a+i);
				*(a+i)=*(a+j);
				*(a+j)=t;
			}
		}
	}
	for (int i = 0; i < n; ++i)
	{
		printf("%d  ",*(a+i) );
	}
}

void desSort(int* a , int n){
	
	for (int i = 0; i < n; ++i)
	{
		for (int j = i+1; j < n; ++j)
		{
			if (*(a+i)<*(a+j))
			{
				int t=*(a+i);
				*(a+i)=*(a+j);
				*(a+j)=t;
			}
		}
	}
	for (int i = 0; i < n; ++i)
	{
		printf("%d  ",*(a+i) );
	}
}


void main(){
	printf("Enter size\n");
	int n;
	scanf("%d",&n);
	int m=n/2;
	int a[n],b1[m],b2[n-m],j=0,k=0;
	printf("Enter elements\n");
	for (int i = 0; i < n; ++i)
	{
		scanf("%d",&a[i]);
	}
	for (int i = 0; i < n; ++i)
	{
		if (i<m)
		{
			b1[j]=a[i];
			j++;
		}else{
			b2[k]=a[i];
			k++;
		}
	}
	ascSort(b1,m);
	desSort(b2,n-m);
	printf("\n");
}