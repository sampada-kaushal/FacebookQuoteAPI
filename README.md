# FacebookQuoteAPI
The auto generated quote will be uploaded to your Facebook account as an image.
This is the initial version of the application wherein the automatic quote generator will be posting an image on Facebook, thereby the API is also uploaded.

The API is bundled with the following stuff-

1. Facebook.java is responsible for authenticationg the user and allowing you to post image on it
2. Fetch.java is used to fetch the quote randomly.
3. TextToImage.java is used to convert the chosen quote to the image that will be posted by Facebook.java

All you need to do is paste the url generated on the console onto your web browser.

A QuoteRunner is also made which makes use of the API made above and imports it as FacebookQuoteAPI.jar to make use of it. After successful run
of the application, a success note is printed on the console that the image is successfully posted which can be verified by going to the respective
Facebook account.

Note** The user must make necessary customisations/changes for the access token of Facebook for his/her valid Facebook account.
    ** Chromedriver and geckodriver were added to completely automate the API which would be done in next version.
    ** Quote.png is the image generated after successful conversion
    ** restfb-1.36.0.jar is used in it.
