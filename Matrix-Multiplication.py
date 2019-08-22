#python code for Matrix_Multiplication
R = int(input("Enter the number of rows:")) #rowinsertion
C = int(input("Enter the number of columns:")) #coloumninsertion
matrix1 = [] 
print("Enter the entries rowwise:")
for i in range(R):
    a1 =[]
    for j in range(C):
        a1.append(int(input()))
    matrix1.append(a1)
print("matrix 1 is :")
for i in range(R): 
    for j in range(C):
        print(matrix1[i][j], end = " ")
    print() 
matrix2 = [] 
print("Enter the entries rowwise:")
for i in range(R):
    a2 =[]  
    for j in range(C):
        a2.append(int(input()))
    matrix2.append(a2)
print("matrix 2 is :")
for i in range(R): 
    for j in range(C): 
        print(matrix2[i][j], end = " ")
    print() 
res_matrix =[[0 for j in range(0,C)]for i in range(0,R)]
for i in range(len(matrix1)):
    for j in range(len(matrix2[0])):
        for k in range(len(matrix2)):
            res_matrix[i][j]=matrix1[i][k]*matrix2[k][j]
print("resultant matrix is :")                
for i in range(R):
    for j in range(C):
        print("\t",res_matrix[i][j],end=" ")
    print("\n")
