#include <stdio.h>
#include <stdlib.h>
struct pair
{
	int e1;
	int e2;
	struct pair* next;
};
struct pair* head = NULL;
// void insert(int d1,int d2){
// 	struct pair* newpair = (struct pair*)malloc(sizeof(struct pair));
// 	newpair->e1 = d1;
// 	newpair->e2 = d2;
// 	newpair->next = NULL;

// 	if (head==NULL)
// 	{
// 		head = newpair;
// 	}else{
// 		struct pair* temp;
// 		for (temp = head; temp->next!= NULL ; temp=temp->next);
// 		temp->next=newpair;
// 	}
// }
void compareInsert(int x,int y){
	struct pair* newpair = (struct pair*)malloc(sizeof(struct pair));
	newpair->e1 = x;
	newpair->e2 = y;
	newpair->next = NULL;
	int c=0;

	if (head==NULL)
	{
		head = newpair;
	}else{
		struct pair* temp;
		for (temp = head; temp!= NULL ; temp=temp->next){
			if (x==temp->e1 && y==temp->e2)
			{
				c=1;
			}
		}

		if (c==0)
		{
			struct pair* temp;
			for (temp = head; temp->next!= NULL ; temp=temp->next);
			temp->next=newpair;	
		}
	}
}
void addPair(){
	struct pair* temp;
	int s=0;
		for (temp = head; temp!= NULL; temp=temp->next){
			s = s + temp->e1 + temp->e2;
		}
		printf("sum = %d\n",s);
}
void printList(){
		struct pair* temp;
		for (temp = head; temp!= NULL; temp=temp->next){
			printf("(%d,%d) ",temp->e1,temp->e2);
		}
		printf("\n");
}
int main(){
	int n;
	printf("Enter size of array\n");
	scanf("%d",&n);
	int a[n] , b[n];
	printf("Enter the elements\n");
	for (int i = 0; i < n; ++i)
	{
		scanf("%d",&a[i]);
	}

	for (int i = 0; i < n; ++i)
	{
		b[i] = a[i];
	}

	for (int i = 0; i < n; ++i)
	{
		for (int j = 0; j < n; ++j)
		{
			compareInsert(a[i],b[j]);
		}
	}

	printList();
	addPair();	
}