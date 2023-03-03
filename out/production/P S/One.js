var x,y,z,temp=0;

y=Number(document.getElementById("demo").value);

z=y;
while(y>0)
{
x=y%10;
y=parseInt(y/10);
temp=temp*10+x;
}
alert(temp);
console.log(reverse)
