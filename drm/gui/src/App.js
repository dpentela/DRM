import React, { Component } from 'react';
import ReactDOM from 'react-dom';



class App extends Component {
  render() {
    return (
      <div className = "App">
        Hello World!
        <FirstComponent></FirstComponent>
        <ThirdComponent/>
      </div>
    );
  }
}
class FirstComponent extends Component {
  render() {
    return (
      <div className = "firstComponent">
        Component one
        <SecondComponent/>
      </div>
    );
  }
}
class SecondComponent extends Component {
  render() {
    return (
      <div className = "secondComponent">
        Component two
      </div>
    );
  }
}
function ThirdComponent() {
    return (
      <div className = "thirdComponent">
        Component three
      </div>
    );
}

export default App;