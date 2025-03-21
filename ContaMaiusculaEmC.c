#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int contaMaiusculas(char palavra[]) {
    int maiusculas = 0;
    for (int i = 0; i < strlen(palavra); i++) {
        if (isupper(palavra[i])) {
            maiusculas++;
        }
    }
    return maiusculas;
}

int main() {
    char palavra[100];

    while (1) {
        fgets(palavra, sizeof(palavra), stdin);

        palavra[strcspn(palavra, "\n")] = 0;

        if (strcmp(palavra, "FIM") == 0) {
            break;
        }
        printf("%d\n", contaMaiusculas(palavra));
    }

    return 0;
}
