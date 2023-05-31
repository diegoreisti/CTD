function InputComponent(props) {
    return (
        <>
            <label htmlFor={props.id}> {props.label ?? "Unknown"} </label>
            <input 
                id={props.id} 
                type={props.type ?? "text"} 
                placeholder={props.placeholder ?? "Unknown"}
                value={props.value}
                onChange={props.fnOnChange}
            />
        </>
    )
}

export default InputComponent
