import React, { Component } from 'react'
import PhaseTapChangerNonLinearService from '../services/PhaseTapChangerNonLinearService'

class ViewPhaseTapChangerNonLinearComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            phaseTapChangerNonLinear: {}
        }
    }

    componentDidMount(){
        PhaseTapChangerNonLinearService.getPhaseTapChangerNonLinearById(this.state.id).then( res => {
            this.setState({phaseTapChangerNonLinear: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> View PhaseTapChangerNonLinear Details</h3>
                    <div className = "card-body">
                    </div>
                </div>
            </div>
        )
    }
}

export default ViewPhaseTapChangerNonLinearComponent
