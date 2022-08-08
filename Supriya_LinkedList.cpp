#include <bits/stdc++.h>
using namespace std;
class Node {
public:
	int data;
	Node* next;
	Node()
	{
		data = 0;
		next = NULL;
	}
	Node(int data)
	{
		this->data = data;
		this->next = NULL;
	}
};

class Linkedlist {
	Node* head;

public:
	Linkedlist() 
	{
	    head = NULL;
	}
	
	int size()
	{
	    Node *temp1 = head;
	    int l = 0;
	    while (temp1 != NULL)
	    {
		    temp1 = temp1->next;
		    l++;
	    }
	    return l;
	}
	
	void add(int data)
	{
	    if (head == NULL)
	    {
		    head = new Node(data);
	    }
	    else
	    {
	        Node* temp = head;
	        while (temp->next != NULL)
	            temp = temp->next;
	        temp->next = new Node(data);
	    }
	}
	
	void insert(int data,int index)
	{
	    if(index==1 || size()==index)
	        add(data);
	    else
	    {
	        Node* temp = head;
	        int c=0;
	        while(c<index)
	        {
	            temp=temp->next;
	        }
	        temp->next=new Node(data);
	    }
	}
	void print()
	{
	    Node* temp = head;
	    while (temp != NULL) 
	    {
		    cout << temp->data << " ";
		    temp = temp->next;
	    }
	}
	void delete(int index)
	{
	    Node *temp1 = head, *temp2 = NULL;
	    temp1 = head;
	    if (index == 1)
	    {
		    head = head->next;
		    delete temp1;
	    }
	    while (index-- > 1)
	    {
		    temp2 = temp1;
		    temp1 = temp1->next;
	    }
	    temp2->next = temp1->next;
	    delete temp1;
    }
};
