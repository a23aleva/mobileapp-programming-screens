
# Rapport


```
Button knapp=findViewById(R.id.buttonToNextScreen);
knapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", "Poligrafovich");
                intent.putExtra("number", 10);
                startActivity(intent);
}
```

![](Screen1.png)
![](Screen2.png)

