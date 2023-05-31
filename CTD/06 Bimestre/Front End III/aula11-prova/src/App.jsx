import { useState } from 'react'
//import reactLogo from './assets/react.svg'
//import viteLogo from '/vite.svg'
import './App.css'
import InputComponent from '../components/input/InputComponent'
import CardComponent from '../components/card/CardComponent'

function App() {
  const [nomeCor, setNomeCor] = useState("");
  const [hexaCor, setHexaCor] = useState("");
  const [card, setCard] = useState({});
  const [allCards, setAllCards] = useState([]);

  const handleSetNomeCor = (event) => {
    setNomeCor(event.target.value)
  }

  const handleSetHexaCor = (event) => {
    setHexaCor(event.target.value)
  }

  const handleButtonClick = (event) => {

    event.preventDefault()

    const newCard = (
      {
        nomeCor: nomeCor,
        hexaCor: hexaCor,
      }
    )   

    setAllCards([newCard, ...allCards])  

  }

  return (
    <>
      <form action="">
        <div>
          <h3>ADICIONAR NOVA COR</h3>
          
          {/*<label>Nome: </label>
        <input type="text" /> */}

          <InputComponent
            id="nomeCor"
            label="Nome"
            placeholder="Nome da cor"
            value={nomeCor}
            onChange={handleSetNomeCor}
          />

          <br />

          {/* <label>Cor: </label>
        <input type="text" /> */}

          <InputComponent
            id="hexaCor"
            label="Cor"
            placeholder="Insira sua cor no formato Hexadecimal"
            value={hexaCor}
            onChange={handleSetHexaCor}
          />

        </div>

        <br />

        {/* <button onClick={handleButtonClick}>Salvar</button> */}

      </form>

      <br />
      <br />


      {/* <div class="quadrado">
        <span class="texto-pequeno">Texto menor</span>
        <span class="texto-grande">Texto maior e negrito</span>
      </div> */}
      <h3>CORES FAVORITAS</h3>

      <CardComponent />

      

    </>
  )
}

export default App


//function App() {
//  const [count, setCount] = useState(0)

//   return (
//     <>
//       <div>
//         <a href="https://vitejs.dev" target="_blank">
//           <img src={viteLogo} className="logo" alt="Vite logo" />
//         </a>
//         <a href="https://react.dev" target="_blank">
//           <img src={reactLogo} className="logo react" alt="React logo" />
//         </a>
//       </div>
//       <h1>Vite + React</h1>
//       <div className="card">
//         <button onClick={() => setCount((count) => count + 1)}>
//           count is {count}
//         </button>
//         <p>
//           Edit <code>src/App.jsx</code> and save to test HMR
//         </p>
//       </div>
//       <p className="read-the-docs">
//         Click on the Vite and React logos to learn more
//       </p>
//     </>
//   )
// }