
// 3X4 cal   (5d spacing)
#include <stdio.h>

int main (){
    int day,year,startingday,i,j;
    printf("enter the year: ");
    scanf("%d",&year);
    printf("enter starting day (1-7): ");
    scanf("%d",&startingday);
    char month[][12]={"January",
                            "February",
                            "March",
                            "April",
                            "May",
                            "June",
                            "July",
                            "August",
                            "September",
                            "October",
                            "November",
                            "December"
                            };
    int daysinmonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
        aysinmonth[1]=29;
    }
    int sday1 = startingday -1;
    for (int i = 0; i <= 9; i+=3){
        int monthdays1 = daysinmonth[i], monthdays2 = daysinmonth[i+1], monthdays3 =daysinmonth[i+2];
        int sday2 = (sday1 + monthdays1)%7;
        int sday3 = (sday2 + monthdays2)%7;
        printf("  \n%14s    \t%28s    \t%34s\n",month[i],month[i+1],month[i+2]);
        printf("\n**Sun  Mon  Tue  Wed  Thu  Fri  Sat** Sun  Mon  Tue  Wed  Thu  Fri  Sat** Sun  Mon  Tue  Wed  Thu  Fri  Sat**\n");



        int d1=1,d2=1,d3=1;
        int r1=0,r2=0,r3=0,k;
        int f1=0,f2=0,f3=0,l;
        while(d1<=monthdays1||d2<=monthdays2||d3<=monthdays3){
            printf("\n");
            if(r1==0){
                for (k = 0; k < sday1; k++){
                    printf("%5c",' ');
                }
                r1++;
            }
            for (int j = d1; j <=monthdays1; j++,d1++){
                printf("%5d", j);
                if (++k > 6){
                    k = 0; break;
                }
            }
            if(d1>monthdays1){
                f1=6-k+1;
                for (l = 0; l < f1; l++){
                    printf("%5c",' ');
                }
                k = 0;
            }

            if (r2==0){
                for (k = 0; k < sday2; k++){
                    printf("%5c",' ');
                }
                r2++;
            }
            for (int j = d2; j <= monthdays2; j++,d2++){
                printf("%5d", j);
                if (++k > 6){
                    k = 0; break;
                }
            }
            if(d2>monthdays2){
                f2 = 6-k+1;
                for (l = 0; l < f2; l++) {
                    printf("%5c",' ');
                }
                k = 0;
            }
            if (r3==0){
                for (k = 0; k < sday3; k++){
                    printf("%5c",' ');
                }
                r3++;
            }
            for (int j = d3; j <= monthdays3; j++,d3++){
                printf("%5d", j);
                if (++k > 6){
                        k = 0; break;
                }
            }
            d1++,d2++,d3++;
        }
        sday1 = (sday3+(monthdays3))%7 ;
    }
}


