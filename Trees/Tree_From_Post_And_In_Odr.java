class Index
{
int index;
}
class Result
{
  static Node buildt(int in[],int post[],int str,int end,Index pIndex)
  {
    if(str>end)
      return null;
    Node root=new Node(post[pIndex.index]);
    (pIndex.index)--;
    if(str==end)
      return root;
    int iIndex=search(in,str,end,root.data);
    root.rightChild=buildt(in,post,iIndex+1,end,pIndex);
    root.leftChild=buildt(in,post,str,iIndex-1,pIndex);
    return root;
  }
  static int search(int in[],int str,int end,int value)
  {
    int i;
    for(i=str;i<=end;i++)
    {
      if(in[i]==value)
        break;
    }
    return i;
  }
  static Node buildTree(int in[], int post[], int N)
  {
    Index pIndex=new Index();
    pIndex.index=N-1;
    return buildt(in,post,0,N-1,pIndex);
  }
  
}