#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int contaMaiusculas(char palavra[], int contador) {
    int maiusculas = 0;
    if(contador > strlen(palavra)) {
        return maiusculas;
    }
    if(isupper(palavra[contador])) {
         return 1 + contaMaiusculas(palavra, contador + 1);
    }
    return contaMaiusculas(palavra, contador + 1);
    
}

int main() {
    char palavra[100];

    while (1) {
        fgets(palavra, sizeof(palavra), stdin);

        palavra[strcspn(palavra, "\n")] = 0;

        if (strcmp(palavra, "FIM") == 0) {
            break;
        }
        printf("%d\n", contaMaiusculas(palavra,0));
    }

    return 0;
}