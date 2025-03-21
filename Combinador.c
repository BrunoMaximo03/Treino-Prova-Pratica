#include <stdlib.h>
#include <stdio.h>

char* combinaStrings(char primeira[], char segunda[], char combinada[]) {
    int i = 0, j = 0, k = 0;
    
    // Intercala enquanto houver caracteres em ambas as strings
    while (primeira[i] != '\0' && segunda[j] != '\0') {
        combinada[k++] = primeira[i++];
        combinada[k++] = segunda[j++];
    }

    // Adiciona o restante da string primeira, se houver
    while (primeira[i] != '\0') {
        combinada[k++] = primeira[i++];
    }

    // Adiciona o restante da string segunda, se houver
    while (segunda[j] != '\0') {
        combinada[k++] = segunda[j++];
    }

    combinada[k] = '\0'; 
    return combinada;
}

int main() {
    char primeira[50];
    char segunda[50];
    char combinada[100];

    
    while(scanf("%s %s", primeira, segunda) == 2) {
        printf("%s\n", combinaStrings(primeira, segunda, combinada));
    }

    return 0;
}
