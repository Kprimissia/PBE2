document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastroEnderecoForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const cep = document.getElementById("cep").value;
		const estado = document.getElementById("estado").value;
		const cidade = document.getElementById("cidade").value;
		const numeroCasa = document.getElementById("numeroCasa").value;
		const rua = document.getElementById("rua").value;
		const complemento = document.getElementById("complemento").value;
		const bairro = document.getElementById("bairro").value;

		try {

			const response = await fetch("http://localhost:8080/cadastroendereco", {
				method: "POST",
				headers: {
					"Content-type": "application/json"
				},

				body: JSON.stringify({
					cep,
					estado,
					cidade,
					numeroCasa,
					rua,
					complemento,
					bairro
				}),
			});

			if (response.ok) {
				alert("Endereço cadastrado com sucesso!");
			} else {
				alert("Erro ao cadastrar endereço");
			}

		} catch (error) {
			console.error("Erro ao cadastrar o endereço", error);
		}

	});
})