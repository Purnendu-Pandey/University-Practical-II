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
    int q[20],head,n,j,i,seek=0,max,diff;
    printf("\nEnter the maximum range of disk : ");
    scanf("%d",&max);
    printf("\nEnter the size of queue request : ");
    scanf("%d",&n);
    printf("\nEnter disk position to be read :\n");
    for (i=1;i<=n;i++)
        scanf("%d",&q[i]);
        printf("Enter the initial head position : ");
        scanf("%d",&head);
        q[0]=head;
        for (j=0;j<=n-1;j++)
        {
            diff=abs(q[j+1]-q[j]);
            seek+=diff;
            printf("Disk head moves from %d to %d with seek %d \n",q[j],q[j+1],diff);
        } 
        printf("Total head movement is : %d\n",seek);
        return 0;
}        
*/