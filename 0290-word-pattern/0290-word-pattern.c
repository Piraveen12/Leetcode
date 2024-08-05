bool wordPattern(char* pattern, char* s) {
    int n=strlen(pattern);
    char l1[n];
    char l2[300][300];
    char l3[300][300];
    for(int i=0;i<n;i++){
        l1[i]=pattern[i];
    }
    char *p=strtok(s," ");
    int j=0;
    while(p!=NULL){
        strcpy(l2[j++],p);
        p=strtok(NULL," ");
    }
  
    if(n!=j){
        return false;
    }
      for(int i=0;i<j;i++){
        for(int k=i+1;k<j;k++ ){
            if(l1[i]==l1[k]){
                int len=strlen(l2[i]);
                int len2=strlen(l2[k]);
                if(len!=len2){
                    return false;
                }
            }
        }
    }
    
    int count[n];
    for(int i=0;i<n;i++){
        count[i]=0;
    }
    for(int i=0;i<j;i++){
        int len=strlen(l2[i]);
        if(count[i]>0 ){
            continue;
        }
        
        char word[100];
        strcpy(word,l2[i]);
        strcpy(l3[i],word);
        for(int k=i+1;k<n;k++){
            if(l1[i]==l1[k]){
                strcpy(l3[k],word);
                count[k]++;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(l1[i]!=l1[j]){
               if(strcmp(l2[i],l3[j])==0){
                        return false;
               } 
            }
        }
    }
    int flag=1;
    for(int i=0;i<n;i++){
        int len =strlen(l2[i]);
        for(int j=0;j<len;j++){
            if(l2[i][j]!=l3[i][j]){
                flag=0;
            }
        }
    }

    if(flag==0)
    return false;
    return true;
}