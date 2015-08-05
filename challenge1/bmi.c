#include <stdio.h>
#include <string.h>
#define MAX_LENGTH 20

float bmi(float weight, float height){
    float f;
    f = weight/(height*height);
    return f;
}

char * id(int age, char gender, char* name, char*country) {
    char id[26];
    strncat(id,"%s", country);
    strncat(id,"%s",name);
    return id;
}
                                                                 //TODO
int main(void) {
    
    char name[MAX_LENGTH];
    int age;
    char country[MAX_LENGTH];
    char gender;
    float height;
    float weight;
    
	printf("What's your name?\n");
	scanf("%s",name);
	printf("\nWhere are you from?\n");
	scanf("%s",country);
	printf("\nHow old are you?\n");
	scanf("%d",&age);
	printf("\nWhat's your gender?(M/F)\n");
	scanf("%c",&gender);
	printf("\nHow much do you weigh?\n");
	scanf("%f",&weight);
	printf("\nHow tall are you?\n");
	scanf("%f",&height);
	printf("\n %f \n",bmi(weight,height));
	printf("\n %s \n", id(age, gender, name, country));
	return 0;
}
