const API_URL = "http://localhost:8080/api";

async function loadDashboard() {

    try {

        // Dashboard Counts
        const voters =
            await fetch(`${API_URL}/voters/count`);

        const candidates =
            await fetch(`${API_URL}/candidates/count`);

        const votes =
            await fetch(`${API_URL}/votes/count`);

        document.getElementById("voterCount").innerText =
            await voters.text();

        document.getElementById("candidateCount").innerText =
            await candidates.text();

        document.getElementById("voteCount").innerText =
            await votes.text();

        // Winner Data
        const winnerResponse =
            await fetch(`${API_URL}/dashboard/winner`);

        const winner =
            await winnerResponse.json();

        document.getElementById("winnerName").innerText =
            winner.winnerName;

        document.getElementById("winnerParty").innerText =
            winner.winnerParty;

        document.getElementById("winnerVotes").innerText =
            winner.votes;

    } catch (error) {

        console.error(error);

    }
}

async function loadVoteDistribution() {

    try {

        const response =
            await fetch(
                `${API_URL}/dashboard/vote-distribution`
            );

        const data =
            await response.json();

        const labels =
            data.map(item => item.candidateName);

        const votes =
            data.map(item => item.votes);

        new Chart(
            document.getElementById("voteChart"),
            {
                type: "bar",

                data: {
                    labels: labels,

                    datasets: [{
                        label: "Votes",

                        data: votes,

                        backgroundColor: [
                            "#dc3545",
                            "#0d6efd",
                            "#198754",
                            "#ffc107",
                            "#6f42c1"
                        ]
                    }]
                },

                options: {
                    responsive: true,

                    plugins: {
                        legend: {
                            display: false
                        }
                    },

                    scales: {
                        y: {
                            beginAtZero: true,
                            ticks: {
                                stepSize: 1
                            }
                        }
                    }
                }
            }
        );

    } catch (error) {

        console.error(error);

    }
}

async function loadCandidateList() {

    try {

        const response =
            await fetch(
                `${API_URL}/dashboard/candidates`
            );

        const data =
            await response.json();

        const candidateList =
            document.getElementById("candidateList");

        candidateList.innerHTML = "";

        data.forEach(candidate => {

            candidateList.innerHTML += `
                <tr>
                    <td>${candidate.candidateName}</td>
                    <td>${candidate.party}</td>
                    <td>${candidate.votes}</td>
                </tr>
            `;
        });

    } catch (error) {

        console.error(error);

    }
}

loadDashboard();
loadVoteDistribution();
loadCandidateList();