#include <bits/stdc++.h>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
    Node()
    {
        data = 0;
        next = NULL;
    }
    Node(int x)
    {
        this->data = x;
        this->next = NULL;
    }
};

class linkedlist
{
    Node *head;

public:
    linkedlist()
    {
        head = NULL;
    }

    int Size()
    {
        int cnt = 0;
        Node *temp = head;
        while (temp)
        {
            temp = temp->next;
            cnt++;
        }
        return cnt;
    }

    void add(int x)
    {
        if (head == NULL)
        {
            head = new Node(x);
        }
        else
        {
            Node *temp = head;
            while (temp->next != NULL)
                temp = temp->next;
            temp->next = new Node(x);
        }
    }
    void insert(int x, int index)
    {
        if (index == 1 || Size() == index)
            add(x);
        else
        {
            Node *temp = head;
            int cnt = 0;
            while (cnt < index)
            {
                temp = temp->next;
                cnt++;
            }
            temp->next = new Node(x);
        }
    }

    void print()
    {
        Node *temp = head;
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
    }

    int Delete(int index)
    {
        if (index > Size())
        {
            cout << "OUT of Index" << endl;
            return -1;
        }

        Node *temp, *temp1, *temp2;
        temp = head;
        if (index == 1)
        {
            head = head->next;
            delete temp;
            return;
        }

        temp1 = head;
        temp2 = NULL;
        int c = 1;
        while (c < index)
        {
            temp2 = temp1;
            temp1 = temp1->next;
            c++;
        }
        temp2->next = temp1->next;
        delete temp1;
    }
};

