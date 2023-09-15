<!DOCTYPE html>
<html>
  <head>
    <title>My Unique Website</title>
  </head>
  <body>
    <h1>Welcome to my unique website!</h1>
    
    <p>Check out some of my favorite things:</p>
    
    <ul>
      <li><a href="#" onclick="showGif()">Funny Gifs</a></li>
      <li><a href="#" onclick="showJoke()">Hilarious Jokes</a></li>
    </ul>
    
    <div id="gif" style="display: none;">
      <img src="https://media.giphy.com/media/3oriO6xh87JgWYdQw8/giphy.gif" alt="Funny Gif">
    </div>
    
    <div id="joke" style="display: none;">
      <p>Why did the tomato turn red?</p>
      <p>Because it saw the salad dressing!</p>
    </div>
    
    <script>
      function showGif() {
        document.getElementById("gif").style.display = "block";
      }
      
      function showJoke() {
        document.getElementById("joke").style.display = "block";
      }
    </script>
  </body>
</html>