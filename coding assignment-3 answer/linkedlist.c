#include <stdio.h>
#include <stdlib.h>
struct node
{
	int data;
	struct node* next;
};
struct node* head = NULL;
void insert(int d){
	struct node* newNode = (struct node*)malloc(sizeof(struct node));
	newNode->data = d;
	newNode->next = NULL;

	if (head==NULL)
	{
		head = newNode;
	}else{
		struct node* temp;
		for (temp = head; temp->next!= NULL ; temp=temp->next);
		temp->next=newNode;
	}
}
void printList(){
	if (head != NULL)
	{
		struct node* temp;
		for (temp = head; temp->next!= NULL; temp=temp->next){
			printf("%d -->",temp->data);
		}
		printf("\n");
	}else{
		printf("List is empty\n");
	}
}
int main(){
	// struct node* newNode = (struct node*)malloc(sizeof(struct node));
	while(1){
	printf("Enter data\n");
	int d;
	scanf("%d",&d);
	insert(d);
	printList();
	}
	
}