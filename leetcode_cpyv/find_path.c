/**********
*author：fyping
*time: 20170808

* find_path
************/

#include<stdio.h>

#define MAX_LEN 6

static int route[MAX_LEN][MAX_LEN] = {
        { 0,0,0,0,1,1},
        { 1,1,0,0,1,0},
        { 0,1,1,1,1,0},
        { 0,0,1,0,1,2},
        { 0,0,1,0,1,0},
        { 0,0,1,1,1,0}
    };
    static int value[MAX_LEN][MAX_LEN]={
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };

void print_the_route(){
    printf("This is the value\n");
    printf("-----------------------------------------------------------\n");
    int i=0,j=0;
    for(;i<MAX_LEN;i++){
        for(;j<MAX_LEN;j++){
            printf("%d ",value[i][j]);
        }
        printf("\n");
    }
    printf("This is the old route \n");
    printf("-------------------------------------------------------------\n");
    i=0;j=0;
    for(;i<MAX_LEN;i++){
        for(;j<MAX_LEN;j++){
            printf("%d ",route[i][j]);
        }
        printf("\n");
    }
    printf("----------------------------------------------------------------------\n");
}
int is_pos_valid(int x,int y){
    return route[x][y]==1?1:0;
}
int find_path(int x,int y){
    if(route==NULL||x>=MAX_LEN||y>=MAX_LEN){return 0;}
    if(is_pos_valid(x,y)){
        value[x][y]=1;
        if(find_path(x+1,y)){return 1;}
        if(find_path(x-1,y)){return 1;}
        if(find_path(x,y+1)){return 1;}
        if(find_path(x,y-1)){return 1;}
    }else{
        if(is_pos_valid(x+1,y)){find_path(x+1,y);}
        else if(is_pos_valid(x,y+1)){find_path(x,y+1);}
        else if(is_pos_valid(x,y-1)){find_path(x,y-1);}
        else if(is_pos_valid(x+1,y+1)){find_path(x+1,y+1);}
        else if(is_pos_valid(x+1,y-1)){find_path(x+1,y-1);}
    }
    return 0;
}   
int main(int *argc,char *argv[]){
    
    //find_path(0,0);
    print_the_route();
}
