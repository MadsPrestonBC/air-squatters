function Main() {
    return (
        <div>
          <AppBar position="static">
              <Toolbar>
   
                  <Typography
                      variant="h6"
                      component="div"
                      sx={{ flexGrow: 1 }}
                  >
                      Home
                  </Typography>
                  <Button color="inherit">Profile</Button>
              </Toolbar>
          </AppBar>
           <div class="center">Search:
           <input type="Text" placeholder="Search for Events" readonly></input>
           <button>Search</button>
         </div>
         </div>
      );
  }
  
  export default Main;