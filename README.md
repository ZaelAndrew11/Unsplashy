# E12_Refuerzo_Retrofit
  # Desarrollo
  
Este proyecto contiene la base para desarrollar una APP como [Unsplashy](https://play.google.com/store/apps/details?id=com.desafiolatam.unsplashy),
   la cual realiza un request a unsplash.com y muestra 10 imagenes aleatorias cada vez que se abre la aplicación.

  # Instrucciones
Al final de la clase deberás tener funcionando esta aplicación, esto es un ejercicio de Retrofit, lo que falta por implementar es el request http a Unsplash. **Si no te haz creado una cuenta en Unsplash como developer tienes que hacerlo ahora.**

### El request http que tienes que hacer es obtener 10 fotos al azar

## Preparar el proyecto
1.  Antes de escribir 1 línea de código abre Postman y haz el request http ahí primero, cuando te funcione continua.
2.  Debes hacer `git clone` al repositorio y abrirlo en Android Studio.
3.  Debes crear los  modelos que correspondan, en el proyecto encontrarás las clases ya creadas pero vacias. Como estos modelos son un poco extensos te recomendamos que utilices [Json_editor_online](http://www.jsoneditoronline.org/). El truco es copiar y pegar el JSON para aprovecharse de la interfaz gráfica del editor en línea, como referencia:

![Demo picture](https://firebasestorage.googleapis.com/v0/b/bilearning-3a15b.appspot.com/o/e12_refuerzo_retrofit%2FGif%20Json%20online%20editor.gif?alt=media&token=f29dcf7c-db29-417a-b2cb-7eac90e1c359)

## Retrofit
A traves de retrofit hace el request que corresponda utilizando una AsyncTask.

1.  En el proyecto encontrarás la interface, el interceptor y la AsyncTask creadas, pero vacias.
2.  En la interface crea el método que realiza el GET a Unsplash (*Pista:* Fíjate en el 3er parámetro de la AsyncTask para saber qué lleva el `Call<?>` y considera que sólo necesitas 1 query param para saber qué argumento lleva)
3.  Crea el interceptor, puedes ver este [gist para guiarte](https://gist.github.com/cutiko/e8b75896ae12aff9fc580f33fb310e7e)
4.  Implementa el request http en la AsyncTask (*Pista:* Fíjate que el 1er parámetro de la AsyncTask es Void por lo que el count del request http es fijo)
5.  Para echar a andar la AsyncTask para que se ejecute cuando se abre la aplicación tendrás que crear una clase interna (*Pista:* Después tendrás que conectarla con el adapter)
6.  Echa a correr la AsyncTask

## Conectarla con el adapter
Si te fijas el adapter tiene código comentado porque faltaba el modelo, y tiene un método para actuallizarlo.

1.  Descomenta el código en el adapter
2.  Tendrás que pasarle la data al adapter (*Pista:* Hazlo en onPostExecute)

#### Protip
El TextView que muestra el nombre del usuario se le cambio la opacidad al fondo, para simular una apariencia transparente.
ejemplo:

![Demo picture](https://firebasestorage.googleapis.com/v0/b/bilearning-3a15b.appspot.com/o/e12_refuerzo_retrofit%2FGif%20Opacity.gif?alt=media&token=b5849752-cd77-4bdb-a7d4-326f52d3a9c2)






