
bool rotateString(char* s, char* goal) {
    int n = strlen(s);
    if (n != strlen(goal)) return false;  

    char str[2 * n + 1];
    strcpy(str, s);
    strcat(str, s);

    return strstr(str, goal) != NULL;
}