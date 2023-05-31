import style from "./CardComponent.module.css";

function CardComponent(props) {
    return (

        <div className={style.quadrado}>
            <span class={style.textoPequeno}>{props.nomeCor}</span>
            <span class={style.textoGrande}>{props.hexaCor}</span>
        </div>

    )
}

export default CardComponent