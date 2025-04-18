/*
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX 100
typedef struct dir
{
      char fname[20];
      int start;
      struct dir *next;
}NODE;
NODE *head,*last,*temp,*prev,*dell,*tmp;
int n,bit[MAX],fb=0;

void init()
{
      int i;
      printf("Enter total no. of disk blocks : ");
      scanf("%d",&n);
      for (i=0;i<n;i++)
      {
           bit[i]=rand()%2;
      }
}
void show_bitvector()
{
     int i;
     for (i=0;i<n;i++)
          printf("%d ",bit[i]);
     printf("\n");
}
void show_dir()
{
     NODE *temp;
     int i;
     printf("\nDirectory : ");
     printf("\nFile Name   Allocated Block Number");
     for (temp=head;temp!=NULL;temp=temp->next)
     {
          printf("\n %s",temp->fname);
          printf("      %d",temp->start);
     }
     printf("\n\nAllocated Blocks : ");
     for (temp=head;temp!=NULL;temp=temp->next)
     {
          printf("%d->",temp->start);
     }
     printf("NULL\n\n");
}
void create()
{
     NODE *p;
     char fname[20];
     int i,j,nob;
     int fb=0;
     printf("Enter file name : ");
     scanf("%s",&fname);
     printf("Enter the no of blocks : ");
     scanf("%d",&nob);
     for (i=0;i<n;i++)
     {
          if (bit[i]==0)
              fb++;
     }
     if (nob>fb)
     {
         printf("Failed to create file %s\n",fname);
         return;
     }
     else
     {
         for (i=0;i<n;i++)
         {
              if (bit[i]==0 && nob!=0)
              {
                  p=(NODE*)malloc(sizeof(NODE));
                  strcpy(p->fname,fname);
                  nob--;
                  bit[i]=1;
                  p->start=i;
                  p->next=NULL;
                  if (head==NULL)
                      head=p;
                  else
                      last->next=p;
                  last=p;
              }
         }
         printf("File %s created successfully \n",fname);
     }
}
void delete()
{
     int i=0;
     NODE *p,*q;
     char fname[20];
     
     temp=head;
     printf("Enter file to be deleted : ");
     scanf("%s",fname);
     
     while (temp!=NULL)
     {
            p=q=head;
            while (p!=NULL)
            {
                   if (strcmp(p->fname,fname)==0)
                       break;
                       
                   q=p;
                   p=p->next;
            }
            
            if (p==NULL)
            {
                return;
            }
            
            if (p==head)
                head=head->next;
            else if (p==last)
            {
                last=q;
                last->next=NULL;
            }
            else
            {
                 q->next=p->next;
            }
            bit[p->start]=0;
            free(p);
            temp=temp->next;
     }
     printf("File %s deleted successfully\n",fname);
}

int main()
{
    int ch;
    init();
    while(1)
    {
        printf("\n-----Menu-----\n");
        printf("\n1.Show bit Vector");
        printf("\n2.Create New File");
        printf("\n3.Show Directory");
        printf("\n4.Delete File");
        printf("\n5.Exit\n");
        printf("\nEnter Your Choice : \n");
        scanf("%d",&ch);
        
        switch (ch)
        {
                case 1: show_bitvector();
                        break;
                case 2: create();
                        break;
                case 3: show_dir();
                        break;
                case 4: delete();
                        break;
                case 5: exit(0);
        }
    }
}
*/


/*
#include<stdio.h>
#include<stdlib.h>
#include<mpi.h>
int main(int argc, char *argv[]) 
{
    MPI_Init(&argc, &argv);
    int rank, size;
    
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    int elements_per_process = 1000 / size;
    srand(rank);
    int local_numbers[elements_per_process];
    for (int i = 0; i < elements_per_process; i++) 
    {
        local_numbers[i] = rand();
    }
    int all_numbers[1000];
    MPI_Gather(local_numbers, elements_per_process, MPI_INT, all_numbers, elements_per_process, MPI_INT, 0, MPI_COMM_WORLD);

    if (rank == 0) 
    {
        printf("Generated Numbers:\n");
        for (int i = 0; i < 1000; i++)
        {
          printf("%d ", all_numbers[i]);   
        }
        printf("\n");
    }
    MPI_Finalize();
    return 0;
}
*/

