import logo from './logo.svg';
import './App.css';
import { Component } from 'react'
import FirstComponent from './components/learning-examples/FirstComponent'
import LearningJavaScript from './components/learning-examples/LearningJavaScript';

function App() {
  return (
    <div className="App">
      My Todo application updated
      <FirstComponent></FirstComponent>
      <MySecondComponent></MySecondComponent>
      <ThirdComponent />
      <ThirForthonent></ThirForthonent>
      <LearningJavaScript></LearningJavaScript>
    </div>
  );
}

function MySecondComponent() {
  return (
    <div className="MySecondComponent">MySecondComponent</div>
  );
}

class ThirdComponent extends Component {
  render() {
    return (
      <div className="ThirdComponent">Third Component</div>
    );
  }
}

class ThirForthonent extends Component {
  render() {
    return (
      <>
      <div className="ForthComponent">Forth Component</div>
      <div className="ForthComponent">Forth Component</div>
      </>
    );
  }
}

export default App;
