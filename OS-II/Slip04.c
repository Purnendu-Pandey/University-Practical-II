/*
#include<stdio.h>
void main()
{
    int i,j,np,nr,allo[10][10],max[10][10],avail[10],need[10][10],op,flag;
    printf("\nEnter Number of Processes: ");
    scanf("%d",&np);
    printf("\nEnter Number of Resources: ");
    scanf("%d",&nr);
    printf("\nEnter Allocation Matrix:\n");
    for (i=0;i<np;i++)
        for(j=0;j<nr;j++)
           scanf("%d",&allo[i][j]);
    printf("\nEnter Max Matrix: "); 
    for (i=0;i<np;i++)
        for(j=0;j<nr;j++)
           scanf("%d",&max[i][j]);
    for (i=0;i<np;i++)
        for (j=0;j<nr;j++)
             need[i][j]=max[i][j]-allo[i][j];
    for (i=0;i<nr;i++)
        avail[i]=-1;
           
    while(1)
    {
        printf("\n1. Accept Available matrix");
        printf("\n2. Display Allocation & Max");
        printf("\n3. Display Need Matrix");
        printf("\n4. Display Available Matrix");
        printf("\n5. Display All");
        printf("\n6. Exit");
        printf("\nEnter Operation : ");
        scanf("%d",&op);
        switch(op)
        {
            case 1 :
                    printf("\nEnter Available Matrix :\n");
                    for (i=0;i<nr;i++)
                        scanf("%d",&avail[i]);
                   break;
            case 2 :
                    printf("\n** Allocation Matrix **\n");
                    for (i=0;i<np;i++)
                    {
                        printf("P%d ",i);
                        for (j=0;j<nr;j++)
                            printf(" %d",allo[i][j]);
                        printf("\n");
                    }
                    
                    printf("\n** Max Matrix **\n");
                    for (i=0;i<np;i++)
                    {
                        printf("P%d ",i);
                        for (j=0;j<nr;j++)
                            printf(" %d",max[i][j]);
                        printf("\n");
                    }
                   break;
            case 3 : 
                    printf("\n** Need Matrix **\n");
                    for (i=0;i<np;i++)
                    {
                        for (j=0;j<nr;j++)
                            printf(" %d",need[i][j]);
                        printf("\n");
                    }
                   break;
            case 4 : 
                    flag=0;
                    for (i=0;i<nr;i++)
                          if (avail[i]==-1)
                          {
                              printf("\n Please First Accept Available Matrix...");
                              flag=1;
                              break;
                          }
                      if (flag==0)
                      {
                          printf("\n** Available Resources **\n");
                          for (i=0;i<nr;i++)
                             printf(" %d",avail[i]);
                      }
                   break;
            case 5 :
                    flag=0;
                    for (i=0;i<nr;i++)
                    if (avail[i]==-1)
                    {
                        printf("\n Please First Accept Available Matrix...");
                        flag=1;
                        break;
                    }
                    if (flag==0)
                    {
                    printf("Process | Allocation |   Max   |   Need   | Available |");
                    for (i=0;i<np;i++)
                    {
                        printf("\n p%d |",i);
                        for (j=0;j<(nr*4+1);j++)
                        {
                            if (j<nr)
                                printf(" %d",allo[i][j]);
                            else
                            if (j<2*nr)
                            {
                                if (j==nr)
                                printf("   |");
                                printf("  %d",max[i][j-nr]);
                            }
                            else
                            if (j<3*nr)
                            {
                                if (j==2*nr)
                                    printf("  |");
                                printf("  %d",need[i][j-(2*nr)]);
                            }
                            else
                            if (j<4*nr)
                            {
                                if (j==3*nr)
                                    printf(" | ");
                                if (i==0)
                                    printf("  %d",avail[j-3*nr]);
                            }
                            else
                            if (i==0)
                                printf("  |");
                        }
                    } 
                    }
                   break;
            case 6 :       
                    default :
                     printf("\nEnter Valid Option....");
        }
        
    }
}
*/


/*
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int q[100],j,n,i,seek=0,max,head,move;
	printf("\n Enter the number of request: ");
	scanf("%d",&n);
	printf("\n Enter the request sequence: ");
	for(i=0;i<n;i++)
		scanf("%d",&q[i]);
	printf("\n Enter initial head position: ");
	scanf("%d",&head);
	printf("\n Enter total disk size: ");
	scanf("%d",&max);
	printf("\n Enter the head movement direction for high 1 and for low 0: ");
	scanf("%d",&move);
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(q[j]>q[j+1])
			{
				int temp;
				temp=q[j];
				q[j]=q[j+1];
				q[j+1]=temp;
			}
		}
	}
	
	int index;
	for(i=0;i<n;i++)
	{
		if(head<q[i])
		{
			index=i;
			break;
		}
	}
	
	printf("\n Sequence of head movement: ");
	if(move==1)
	{
		printf("%d\t",head);
		for(i=index;i<n;i++)
		{
			seek+=abs(q[i]-head);
			head=q[i];
			printf("%d\t",q[i]);
		}
		seek+=abs(max-q[i-1]-1);
		head=max-1;
		printf("%d\t",head);
		for(i=index-1;i>=0;i--)
		{
			seek+=abs(q[i]-head);
			head=q[i];
			printf("%d\t",q[i]);
		}
	}
	else
	{
		printf("%d\t",head);
		for(i=index-1;i>=0;i--)
		{
			seek+=abs(q[i]-head);
			head=q[i];
			printf("%d\t",q[i]);
		}
		seek+=abs(q[i+1]-0);
		head=0;
		printf("%d\t",head);
		for(i=index;i<n;i++)
		{
			seek+=abs(q[i]-head);
			head=q[i];
			printf("%d\t",q[i]);
		}
	}
	printf("\n\n Total head movement are %d",seek);
	return 0;
}

*/