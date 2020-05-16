using System;

namespace Mediator_Design_Pattern
{
    // The Mediator interface

    public interface IMediator
    {
        void Notify(object sender, string ev);
    }

    // Concrete Mediators

    class ConcreteMediator : IMediator
    {
        private Tab_1 _tab_1;

        private Tab_2 _tab_2;

        public ConcreteMediator(Tab_1 tab_1, Tab_2 tab_2)
        {
            this._tab_1 = tab_1;
            this._tab_1.SetMediator(this);
            this._tab_2 = tab_2;
            this._tab_2.SetMediator(this);
        }

        public void Notify(object sender, string ev)
        {
            if (ev == "Deposit ")
            {
                Console.WriteLine("\nMediator reacts on Deposit  and triggers folowing operations:");
                this._tab_2.DoCheque();
            }
            if (ev == "DemandDraft")
            {
                Console.WriteLine("\nMediator reacts on DemandDraft and triggers following operations:");
                this._tab_1.DoWithdraw ();
                this._tab_2.DoCheque();
            }
        }
    }

    // The Base Tab provides the basic functionality of storing a
    // mediator's instance inside tab objects.
    class BaseTab
    {
        protected IMediator _mediator;

        public BaseTab(IMediator mediator = null)
        {
            this._mediator = mediator;
        }

        public void SetMediator(IMediator mediator)
        {
            this._mediator = mediator;
        }
    }

    // Concrete Tabs implement various functionality. They don't depend on
    // other tabs. They also don't depend on any concrete mediator
    // classes.
    class Tab_1 : BaseTab
    {
        public void DoDeposit ()
        {
            Console.WriteLine("Window_1 deposits the Amount.  ");

            this._mediator.Notify(this, "Deposit ");
        }

        public void DoWithdraw ()
        {
            Console.WriteLine("Window_1 withdraws the Amount. ");

            this._mediator.Notify(this, "Withdraw ");
        }
    }

    class Tab_2 : BaseTab
    {
        public void DoCheque ()
        {
            Console.WriteLine("Window_2 deposits the Cheque. \n");

            this._mediator.Notify(this, "Cheque");
        }

        public void DemandDraft()
        {
            Console.WriteLine("Window_2 withdraws the DemandDraft. \n");

            this._mediator.Notify(this, "DemandDraft");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // The Customer code.
            Tab_1 tab_1 = new Tab_1();
            Tab_2 tab_2 = new Tab_2();
            new ConcreteMediator(tab_1, tab_2);

            Console.WriteLine("Customer triggers New Deposit.");
            tab_1.DoDeposit ();

            Console.WriteLine();

            Console.WriteLine("Customer triggers New Withdraw.");
            tab_2.DemandDraft();
        }
    }
}
